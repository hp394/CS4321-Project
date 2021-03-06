package operators;

import util.MyTable;

import java.util.List;

import util.Tuple;

/**
 * @author Yixin Cui
 * @author Haodong Ping
 * ScanOperator class scan the whole table
 *
 */
public class ScanOperator extends Operator{
	
	MyTable table;
	List<String> schema;
	
	/*
	 * Create a ScanOperator 
	 * @param table the table to be scanned
	 */
	public ScanOperator(MyTable table) {
		this.table = table;
		schema = table.getSchemaName();
	}
	
	/*
	 * Call nextTuple in the table object to get next tuple in that table
	 * @return next tuple
	 */
	@Override
	public Tuple getNextTuple() {
		return table.nextTuple();
	}

	/*
	 * reset the table
	 */
	@Override
	public void reset() {
		table.reset();
	}
	
}
