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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Model definition for QueryInterpretation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryInterpretation extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interpretationType;

  /**
   * The interpretation of the query used in search. For example, queries with natural language
   * intent like "email from john" will be interpreted as "from:john source:mail". This field will
   * not be filled when the reason is NO_RESULTS_FOUND_FOR_USER_QUERY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interpretedQuery;

  /**
   * The reason for interpretation of the query. This field will not be UNSPECIFIED if the
   * interpretation type is not NONE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getInterpretationType() {
    return interpretationType;
  }

  /**
   * @param interpretationType interpretationType or {@code null} for none
   */
  public QueryInterpretation setInterpretationType(java.lang.String interpretationType) {
    this.interpretationType = interpretationType;
    return this;
  }

  /**
   * The interpretation of the query used in search. For example, queries with natural language
   * intent like "email from john" will be interpreted as "from:john source:mail". This field will
   * not be filled when the reason is NO_RESULTS_FOUND_FOR_USER_QUERY.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterpretedQuery() {
    return interpretedQuery;
  }

  /**
   * The interpretation of the query used in search. For example, queries with natural language
   * intent like "email from john" will be interpreted as "from:john source:mail". This field will
   * not be filled when the reason is NO_RESULTS_FOUND_FOR_USER_QUERY.
   * @param interpretedQuery interpretedQuery or {@code null} for none
   */
  public QueryInterpretation setInterpretedQuery(java.lang.String interpretedQuery) {
    this.interpretedQuery = interpretedQuery;
    return this;
  }

  /**
   * The reason for interpretation of the query. This field will not be UNSPECIFIED if the
   * interpretation type is not NONE.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * The reason for interpretation of the query. This field will not be UNSPECIFIED if the
   * interpretation type is not NONE.
   * @param reason reason or {@code null} for none
   */
  public QueryInterpretation setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public QueryInterpretation set(String fieldName, Object value) {
    return (QueryInterpretation) super.set(fieldName, value);
  }

  @Override
  public QueryInterpretation clone() {
    return (QueryInterpretation) super.clone();
  }

}
