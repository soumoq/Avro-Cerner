/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.pojo;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface PharmcyProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"PharmcyProtocol\",\"namespace\":\"com.pojo\",\"types\":[{\"type\":\"record\",\"name\":\"Name\",\"fields\":[{\"name\":\"fullName\",\"type\":[\"string\",\"null\"]},{\"name\":\"firstName\",\"type\":[\"string\",\"null\"]},{\"name\":\"lastName\",\"type\":[\"string\",\"null\"]}]},{\"type\":\"record\",\"name\":\"Phrchases\",\"fields\":[{\"name\":\"storeId\",\"type\":\"int\"},{\"name\":\"amount\",\"type\":\"double\"},{\"name\":\"generic\",\"type\":\"string\"},{\"name\":\"purchaseBy\",\"type\":[\"string\",\"null\"]},{\"name\":\"purchaseData\",\"type\":\"string\"}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  public interface Callback extends PharmcyProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = com.pojo.PharmcyProtocol.PROTOCOL;
  }
}