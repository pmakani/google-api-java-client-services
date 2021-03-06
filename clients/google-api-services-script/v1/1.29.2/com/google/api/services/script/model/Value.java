/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.script.model;

/**
 * `Value` represents a dynamically typed value which is the outcome of an executed script Based on
 * Value at: google3/apps/maestro/api/struct.proto?q=message%5c%20Value
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Value extends com.google.api.client.json.GenericJson {

  /**
   * Represents a boolean value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boolValue;

  /**
   * Represents raw byte values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bytesValue;

  /**
   * Represents a date in ms since the epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dateValue;

  /**
   * Represents a repeated `Value`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ListValue listValue;

  /**
   * Represents a null value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nullValue;

  /**
   * Represents a double value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double numberValue;

  /**
   * Represents a structured proto value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> protoValue;

  /**
   * Represents a string value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringValue;

  /**
   * Represents a structured value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Struct structValue;

  /**
   * Represents a boolean value.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoolValue() {
    return boolValue;
  }

  /**
   * Represents a boolean value.
   * @param boolValue boolValue or {@code null} for none
   */
  public Value setBoolValue(java.lang.Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  /**
   * Represents raw byte values.
   * @see #decodeBytesValue()
   * @return value or {@code null} for none
   */
  public java.lang.String getBytesValue() {
    return bytesValue;
  }

  /**
   * Represents raw byte values.
   * @see #getBytesValue()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBytesValue() {
    return com.google.api.client.util.Base64.decodeBase64(bytesValue);
  }

  /**
   * Represents raw byte values.
   * @see #encodeBytesValue()
   * @param bytesValue bytesValue or {@code null} for none
   */
  public Value setBytesValue(java.lang.String bytesValue) {
    this.bytesValue = bytesValue;
    return this;
  }

  /**
   * Represents raw byte values.
   * @see #setBytesValue()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Value encodeBytesValue(byte[] bytesValue) {
    this.bytesValue = com.google.api.client.util.Base64.encodeBase64URLSafeString(bytesValue);
    return this;
  }

  /**
   * Represents a date in ms since the epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDateValue() {
    return dateValue;
  }

  /**
   * Represents a date in ms since the epoch.
   * @param dateValue dateValue or {@code null} for none
   */
  public Value setDateValue(java.lang.Long dateValue) {
    this.dateValue = dateValue;
    return this;
  }

  /**
   * Represents a repeated `Value`.
   * @return value or {@code null} for none
   */
  public ListValue getListValue() {
    return listValue;
  }

  /**
   * Represents a repeated `Value`.
   * @param listValue listValue or {@code null} for none
   */
  public Value setListValue(ListValue listValue) {
    this.listValue = listValue;
    return this;
  }

  /**
   * Represents a null value.
   * @return value or {@code null} for none
   */
  public java.lang.String getNullValue() {
    return nullValue;
  }

  /**
   * Represents a null value.
   * @param nullValue nullValue or {@code null} for none
   */
  public Value setNullValue(java.lang.String nullValue) {
    this.nullValue = nullValue;
    return this;
  }

  /**
   * Represents a double value.
   * @return value or {@code null} for none
   */
  public java.lang.Double getNumberValue() {
    return numberValue;
  }

  /**
   * Represents a double value.
   * @param numberValue numberValue or {@code null} for none
   */
  public Value setNumberValue(java.lang.Double numberValue) {
    this.numberValue = numberValue;
    return this;
  }

  /**
   * Represents a structured proto value.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getProtoValue() {
    return protoValue;
  }

  /**
   * Represents a structured proto value.
   * @param protoValue protoValue or {@code null} for none
   */
  public Value setProtoValue(java.util.Map<String, java.lang.Object> protoValue) {
    this.protoValue = protoValue;
    return this;
  }

  /**
   * Represents a string value.
   * @return value or {@code null} for none
   */
  public java.lang.String getStringValue() {
    return stringValue;
  }

  /**
   * Represents a string value.
   * @param stringValue stringValue or {@code null} for none
   */
  public Value setStringValue(java.lang.String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  /**
   * Represents a structured value.
   * @return value or {@code null} for none
   */
  public Struct getStructValue() {
    return structValue;
  }

  /**
   * Represents a structured value.
   * @param structValue structValue or {@code null} for none
   */
  public Value setStructValue(Struct structValue) {
    this.structValue = structValue;
    return this;
  }

  @Override
  public Value set(String fieldName, Object value) {
    return (Value) super.set(fieldName, value);
  }

  @Override
  public Value clone() {
    return (Value) super.clone();
  }

}
