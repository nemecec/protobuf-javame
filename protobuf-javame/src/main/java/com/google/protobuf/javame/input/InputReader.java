package com.google.protobuf.javame.input;

import java.io.IOException;

import com.google.protobuf.ByteString;

/**
 * 
 * @author hansjar@gmail.com Jarle Hansen
 *
 */
public interface InputReader {
	public int readInt(final int fieldNumber) throws IOException;
	public String readString(final int fieldNumber) throws IOException;
	public boolean readBoolean(final int fieldNumber) throws IOException;
	public double readDouble(final int fieldNumber) throws IOException;
	public float readFloat(final int fieldNumber) throws IOException;
	public long readLong(final int fieldNumber) throws IOException;
	public ByteString readByteString(final int fieldNumber) throws IOException;
	public int getNextFieldNumber() throws IOException;
}
