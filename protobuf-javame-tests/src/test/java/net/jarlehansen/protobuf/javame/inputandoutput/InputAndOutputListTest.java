package net.jarlehansen.protobuf.javame.inputandoutput;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Vector;

import net.jarlehansen.protobuf.javame.ByteString;
import net.jarlehansen.protobuf.javame.ComputeSizeUtil;
import net.jarlehansen.protobuf.javame.SupportedDataTypes;
import net.jarlehansen.protobuf.javame.input.InputReader;
import net.jarlehansen.protobuf.javame.input.taghandler.DefaultUnknownTagHandlerImpl;
import net.jarlehansen.protobuf.javame.original.input.InvalidProtocolBufferException;
import net.jarlehansen.protobuf.javame.output.OutputWriter;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author hansjar@gmail.com Jarle Hansen
 * 
 */
public class InputAndOutputListTest {
	private final static int FIELD_ID = 1;

	@SuppressWarnings("rawtypes")
	private Vector list;

	@Before
	@SuppressWarnings("rawtypes")
	public void setUp() {
		list = new Vector();
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testWriteAndReadIntList() throws IOException {
		final int intValue1 = 1241266623;
		final int intValue2 = 10050;

		list.addElement(new Integer(intValue1));
		list.addElement(new Integer(intValue2));

		final byte[] data = new byte[ComputeSizeUtil.computeListSize(FIELD_ID, SupportedDataTypes.DATA_TYPE_INT, list)];
		final OutputWriter outputWriter = new OutputWriter(data);

		outputWriter.writeList(FIELD_ID, SupportedDataTypes.DATA_TYPE_INT, list);
		outputWriter.writeData();

		final InputReader inputReader = new InputReader(data, DefaultUnknownTagHandlerImpl.newInstance());

		assertEquals(intValue1, inputReader.readInt(inputReader.getNextFieldNumber()));
		assertEquals(intValue2, inputReader.readInt(inputReader.getNextFieldNumber()));
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testWriteAndReadStringList() throws IOException {
		final String stringValue1 = "test string";
		final String stringValue2 = "test string2";

		list.addElement(stringValue1);
		list.addElement(stringValue2);

		final byte[] data = new byte[ComputeSizeUtil.computeListSize(FIELD_ID, SupportedDataTypes.DATA_TYPE_STRING,
				list)];
		final OutputWriter outputWriter = new OutputWriter(data);

		outputWriter.writeList(FIELD_ID, SupportedDataTypes.DATA_TYPE_STRING, list);
		outputWriter.writeData();

		final InputReader inputReader = new InputReader(data, DefaultUnknownTagHandlerImpl.newInstance());

		assertEquals(stringValue1, inputReader.readString(inputReader.getNextFieldNumber()));
		assertEquals(stringValue2, inputReader.readString(inputReader.getNextFieldNumber()));
	}

	@Test(expected = InvalidProtocolBufferException.class)
	@SuppressWarnings("unchecked")
	public void testWriteAndReadStringListInvalidValue() throws IOException {
		final int intValue1 = 123;
		final int intValue2 = 1812841924;

		list.addElement(Integer.valueOf(intValue1));
		list.addElement(Integer.valueOf(intValue2));

		final byte[] data = new byte[ComputeSizeUtil.computeListSize(FIELD_ID, SupportedDataTypes.DATA_TYPE_INT, list)];
		final OutputWriter outputWriter = new OutputWriter(data);

		outputWriter.writeList(FIELD_ID, SupportedDataTypes.DATA_TYPE_INT, list);
		outputWriter.writeData();

		final InputReader inputReader = new InputReader(data, DefaultUnknownTagHandlerImpl.newInstance());
		inputReader.getNextFieldNumber();

		inputReader.readString(FIELD_ID);
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testWriteAndReadBooleanList() throws IOException {
		final boolean boolValue1 = true;
		final boolean boolValue2 = false;

		list.addElement(Boolean.valueOf(boolValue1));
		list.addElement(Boolean.valueOf(boolValue2));

		final byte[] data = new byte[ComputeSizeUtil.computeListSize(FIELD_ID, SupportedDataTypes.DATA_TYPE_BOOLEAN,
				list)];
		final OutputWriter outputWriter = new OutputWriter(data);

		outputWriter.writeList(FIELD_ID, SupportedDataTypes.DATA_TYPE_BOOLEAN, list);
		outputWriter.writeData();

		final InputReader inputReader = new InputReader(data, DefaultUnknownTagHandlerImpl.newInstance());

		assertEquals(boolValue1, inputReader.readBoolean(inputReader.getNextFieldNumber()));
		assertEquals(boolValue2, inputReader.readBoolean(inputReader.getNextFieldNumber()));
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testWriteAndReadDoubleList() throws IOException {
		final double doubleValue1 = 12.5;
		final double doubleValue2 = 1241.135;

		list.addElement(new Double(doubleValue1));
		list.addElement(new Double(doubleValue2));

		final byte[] data = new byte[ComputeSizeUtil.computeListSize(FIELD_ID, SupportedDataTypes.DATA_TYPE_DOUBLE,
				list)];
		final OutputWriter outputWriter = new OutputWriter(data);

		outputWriter.writeList(FIELD_ID, SupportedDataTypes.DATA_TYPE_DOUBLE, list);
		outputWriter.writeData();

		final InputReader inputReader = new InputReader(data, DefaultUnknownTagHandlerImpl.newInstance());

		assertEquals(doubleValue1, inputReader.readDouble(inputReader.getNextFieldNumber()), 0);
		assertEquals(doubleValue2, inputReader.readDouble(inputReader.getNextFieldNumber()), 0);
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testWriteAndReadFloatList() throws IOException {
		final float floatValue1 = 12.5F;
		final float floatValue2 = 125.1241245F;

		list.addElement(new Float(floatValue1));
		list.addElement(new Float(floatValue2));

		final byte[] data = new byte[ComputeSizeUtil
				.computeListSize(FIELD_ID, SupportedDataTypes.DATA_TYPE_FLOAT, list)];
		final OutputWriter outputWriter = new OutputWriter(data);

		outputWriter.writeList(FIELD_ID, SupportedDataTypes.DATA_TYPE_FLOAT, list);
		outputWriter.writeData();

		final InputReader inputReader = new InputReader(data, DefaultUnknownTagHandlerImpl.newInstance());

		assertEquals(floatValue1, inputReader.readFloat(inputReader.getNextFieldNumber()), 0);
		assertEquals(floatValue2, inputReader.readFloat(inputReader.getNextFieldNumber()), 0);
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testWriteAndReadLongList() throws IOException {
		final long longValue1 = 124124124124124124L;
		final long longValue2 = 941724124L;

		list.addElement(new Long(longValue1));
		list.addElement(new Long(longValue2));

		final byte[] data = new byte[ComputeSizeUtil.computeListSize(FIELD_ID, SupportedDataTypes.DATA_TYPE_LONG, list)];
		final OutputWriter outputWriter = new OutputWriter(data);

		outputWriter.writeList(FIELD_ID, SupportedDataTypes.DATA_TYPE_LONG, list);
		outputWriter.writeData();

		final InputReader inputReader = new InputReader(data, DefaultUnknownTagHandlerImpl.newInstance());

		assertEquals(longValue1, inputReader.readLong(inputReader.getNextFieldNumber()));
		assertEquals(longValue2, inputReader.readLong(inputReader.getNextFieldNumber()));
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testWriteAndReadByteStringList() throws IOException {
		final ByteString byteValue1 = ByteString.copyFromUtf8("testing");
		final ByteString byteValue2 = ByteString.copyFromUtf8("testing testing2");

		list.addElement(byteValue1);
		list.addElement(byteValue2);

		final byte[] data = new byte[ComputeSizeUtil.computeListSize(FIELD_ID, SupportedDataTypes.DATA_TYPE_BYTESTRING,
				list)];
		final OutputWriter outputWriter = new OutputWriter(data);

		outputWriter.writeList(FIELD_ID, SupportedDataTypes.DATA_TYPE_BYTESTRING, list);
		outputWriter.writeData();

		final InputReader inputReader = new InputReader(data, DefaultUnknownTagHandlerImpl.newInstance());

		assertEquals(byteValue1.toStringUtf8(), inputReader.readByteString(inputReader.getNextFieldNumber())
				.toStringUtf8());
		assertEquals(byteValue2.toStringUtf8(), inputReader.readByteString(inputReader.getNextFieldNumber())
				.toStringUtf8());
	}
}
