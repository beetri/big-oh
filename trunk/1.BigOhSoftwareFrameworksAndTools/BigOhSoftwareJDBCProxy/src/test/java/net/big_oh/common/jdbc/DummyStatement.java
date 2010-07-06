package net.big_oh.common.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

/*
 Copyright (c) 2009 Dave Wingate dba Big-Oh Software (www.big-oh.net)

 Permission is hereby granted, free of charge, to any person
 obtaining a copy of this software and associated documentation
 files (the "Software"), to deal in the Software without
 restriction, including without limitation the rights to use,
 copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the
 Software is furnished to do so, subject to the following
 conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 OTHER DEALINGS IN THE SOFTWARE.
 */

/**
 * An object that implement Statement to be used in unit testing.
 * 
 * @author davewingate
 * @version Aug 25, 2009
 */
public class DummyStatement implements Statement
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#addBatch(java.lang.String)
	 */
	public void addBatch(String sql) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#cancel()
	 */
	public void cancel() throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#clearBatch()
	 */
	public void clearBatch() throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#clearWarnings()
	 */
	public void clearWarnings() throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#close()
	 */
	public void close() throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#execute(java.lang.String)
	 */
	public boolean execute(String sql) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#execute(java.lang.String, int)
	 */
	public boolean execute(String sql, int autoGeneratedKeys) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#execute(java.lang.String, int[])
	 */
	public boolean execute(String sql, int[] columnIndexes) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#execute(java.lang.String, java.lang.String[])
	 */
	public boolean execute(String sql, String[] columnNames) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#executeBatch()
	 */
	public int[] executeBatch() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#executeQuery(java.lang.String)
	 */
	public ResultSet executeQuery(String sql) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#executeUpdate(java.lang.String)
	 */
	public int executeUpdate(String sql) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#executeUpdate(java.lang.String, int)
	 */
	public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#executeUpdate(java.lang.String, int[])
	 */
	public int executeUpdate(String sql, int[] columnIndexes) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#executeUpdate(java.lang.String,
	 * java.lang.String[])
	 */
	public int executeUpdate(String sql, String[] columnNames) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getConnection()
	 */
	public Connection getConnection() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getFetchDirection()
	 */
	public int getFetchDirection() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getFetchSize()
	 */
	public int getFetchSize() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getGeneratedKeys()
	 */
	public ResultSet getGeneratedKeys() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getMaxFieldSize()
	 */
	public int getMaxFieldSize() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getMaxRows()
	 */
	public int getMaxRows() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getMoreResults()
	 */
	public boolean getMoreResults() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getMoreResults(int)
	 */
	public boolean getMoreResults(int current) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getQueryTimeout()
	 */
	public int getQueryTimeout() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getResultSet()
	 */
	public ResultSet getResultSet() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getResultSetConcurrency()
	 */
	public int getResultSetConcurrency() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getResultSetHoldability()
	 */
	public int getResultSetHoldability() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getResultSetType()
	 */
	public int getResultSetType() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getUpdateCount()
	 */
	public int getUpdateCount() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#getWarnings()
	 */
	public SQLWarning getWarnings() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#isClosed()
	 */
	public boolean isClosed() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#isPoolable()
	 */
	public boolean isPoolable() throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#setCursorName(java.lang.String)
	 */
	public void setCursorName(String name) throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#setEscapeProcessing(boolean)
	 */
	public void setEscapeProcessing(boolean enable) throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#setFetchDirection(int)
	 */
	public void setFetchDirection(int direction) throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#setFetchSize(int)
	 */
	public void setFetchSize(int rows) throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#setMaxFieldSize(int)
	 */
	public void setMaxFieldSize(int max) throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#setMaxRows(int)
	 */
	public void setMaxRows(int max) throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#setPoolable(boolean)
	 */
	public void setPoolable(boolean poolable) throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Statement#setQueryTimeout(int)
	 */
	public void setQueryTimeout(int seconds) throws SQLException
	{
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Wrapper#isWrapperFor(java.lang.Class)
	 */
	public boolean isWrapperFor(Class<?> iface) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Wrapper#unwrap(java.lang.Class)
	 */
	public <T> T unwrap(Class<T> iface) throws SQLException
	{
		throw new UnsupportedOperationException();
	}

}
