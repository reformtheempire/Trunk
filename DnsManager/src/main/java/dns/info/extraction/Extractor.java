package dns.info.extraction;

import java.io.IOException;

import org.xbill.DNS.Master;
import org.xbill.DNS.Record;

public class Extractor {

	private Record record;
	private Master master;

	/**
	 * Used to instantiate the Extractor, a tool for getting DNS records.
	 * 
	 * @param master
	 */
	public Extractor(Master master) {
		super();
		this.master = master;
	}

	/**
	 * Get a record by name
	 * 
	 * @param name
	 *            of record
	 * @return the specified record
	 * @throws IOException
	 */
	public Record getRecordByName(String name) throws IOException {

		while (!record.getName().toString().equals(name) || !(record == null)) {
			record = master.nextRecord();
		}
		return record;
	}

	/**
	 * Get the next record...
	 * 
	 * @return next record
	 * @throws IOException
	 */
	public Record getNextRecord() throws IOException {
		return master.nextRecord();
	}

	/**
	 * @return the current record
	 */
	public Record getRecord() {
		return record;
	}

}
