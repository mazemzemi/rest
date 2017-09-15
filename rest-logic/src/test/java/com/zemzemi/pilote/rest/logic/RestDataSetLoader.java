package com.zemzemi.pilote.rest.logic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.springframework.core.io.Resource;

import com.github.springtestdbunit.dataset.AbstractDataSetLoader;

/**
 * The class {@link RestDataSetLoader} allows us to use some 'non-static' values
 * in datasets.
 * 
 * @author zemzmi
 */
public class RestDataSetLoader extends AbstractDataSetLoader {

	/**
	 * {@link LOGGER}.
	 */
	private static final Logger LOGGER = LogManager.getLogger(RestDataSetLoader.class);

	/**
	 * To replace a specific word in dataset files.
	 */
	@Override
	protected IDataSet createDataSet(final Resource resource) throws Exception {
		FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
		builder.setColumnSensing(true);
		try (InputStream inputStream = resource.getInputStream()) {

			String fichier = new String(readFromStream(inputStream));
			SimpleDateFormat dateFormatWithTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			Date nowTime = new Date();
			fichier = fichier.replaceAll("\\[NowWithTime\\]", dateFormatWithTime.format(nowTime));

			return builder.build(new ByteArrayInputStream(fichier.getBytes()));
		}
	}

	/**
	 * read data from and InputStream.
	 *
	 * @param is
	 *            InputStream to read.
	 * @return the byte[] read from the inputStream.
	 */
	public static byte[] readFromStream(final InputStream is) {
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();) {
			int lue = 0;
			byte[] tmp = new byte[1024 * 1024];
			while ((lue = is.read(tmp)) != -1) {
				baos.write(tmp, 0, lue);
			}
			return baos.toByteArray();
		} catch (IOException ioe) {
			LOGGER.info(ioe);
			return new byte[0];
		}
	}

}