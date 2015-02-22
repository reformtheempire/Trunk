package ht.tm.dev.chec.whois.server;

import ht.tm.dev.chec.main.Chec;
import ht.tm.dev.chec.whois.information.WhoisServerDetails;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerManager {
	public static Properties props;
	public static Logger log;
	public static String IANAtextFile;
	public static String[] activeTLDs;

	public ServerManager() {
		log = LoggerFactory.getLogger(Chec.class);
		BasicConfigurator.configure();
	}

	public void setupProperties() {
		IANAtextFile = downloadFromUrl();

		activeTLDs = StringUtils.split(IANAtextFile, "\n");
		props = new Properties();

		for (String line : activeTLDs) {
			if (!StringUtils.startsWith(line, "#")) {
				props.put(line, "whois.nic." + line);
			}
		}
		try {
			props.store(new FileOutputStream(
					"src/main/resources/config.properties"),
					"SETTING PROPERTIES");
		} catch (FileNotFoundException e) {
			log.error("No Properties File Found", e);
		} catch (IOException e) {
			log.error("IO EXCEPTION - PROPERTIES LOAD.", e);
		}
	}

	public String downloadFromUrl() // this is the downloader method
	{
		String strFileContents = null;
		try {
			String webURL = "http://data.iana.org/TLD/tlds-alpha-by-domain.txt";
			URL url = new URL(webURL);

			/* Open a connection to that URL. */
			URLConnection ucon = url.openConnection();
			log.info("Connected to IANA. Downloading TLDs.");
			/*
			 * Define InputStreams to read from the URLConnection.
			 */
			InputStream is = ucon.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);

			// create a byte array
			byte[] contents = new byte[1024];

			int bytesRead = 0;

			while ((bytesRead = bis.read(contents)) != -1) {

				strFileContents += new String(contents, 0, bytesRead);

			}

		}

		catch (IOException e) {

		}
		return strFileContents;
	}

	public WhoisServerDetails getServerDetails(String string) {
		Properties serverDetails = new Properties();
		InputStream in = getClass().getResourceAsStream("src/main/resources/config.properties");
		try {
			serverDetails.load(in);
			in.close();
		} catch (IOException e) {
			log.error("Couldn't Load Properties", e);
		}
		
		System.out.println(serverDetails.get("UK"));
		return null;
		}

}
