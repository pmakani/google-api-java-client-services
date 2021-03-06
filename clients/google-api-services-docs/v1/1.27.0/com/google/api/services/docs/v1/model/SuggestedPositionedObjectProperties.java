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

package com.google.api.services.docs.v1.model;

/**
 * A suggested change to PositionedObjectProperties.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuggestedPositionedObjectProperties extends com.google.api.client.json.GenericJson {

  /**
   * A PositionedObjectProperties that only includes the changes made in this suggestion. This can
   * be used along with the positioned_object_properties_suggestion_state to see which fields have
   * changed and their new values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PositionedObjectProperties positionedObjectProperties;

  /**
   * A mask that indicates which of the fields on the base PositionedObjectProperties have been
   * changed in this suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PositionedObjectPropertiesSuggestionState positionedObjectPropertiesSuggestionState;

  /**
   * A PositionedObjectProperties that only includes the changes made in this suggestion. This can
   * be used along with the positioned_object_properties_suggestion_state to see which fields have
   * changed and their new values.
   * @return value or {@code null} for none
   */
  public PositionedObjectProperties getPositionedObjectProperties() {
    return positionedObjectProperties;
  }

  /**
   * A PositionedObjectProperties that only includes the changes made in this suggestion. This can
   * be used along with the positioned_object_properties_suggestion_state to see which fields have
   * changed and their new values.
   * @param positionedObjectProperties positionedObjectProperties or {@code null} for none
   */
  public SuggestedPositionedObjectProperties setPositionedObjectProperties(PositionedObjectProperties positionedObjectProperties) {
    this.positionedObjectProperties = positionedObjectProperties;
    return this;
  }

  /**
   * A mask that indicates which of the fields on the base PositionedObjectProperties have been
   * changed in this suggestion.
   * @return value or {@code null} for none
   */
  public PositionedObjectPropertiesSuggestionState getPositionedObjectPropertiesSuggestionState() {
    return positionedObjectPropertiesSuggestionState;
  }

  /**
   * A mask that indicates which of the fields on the base PositionedObjectProperties have been
   * changed in this suggestion.
   * @param positionedObjectPropertiesSuggestionState positionedObjectPropertiesSuggestionState or {@code null} for none
   */
  public SuggestedPositionedObjectProperties setPositionedObjectPropertiesSuggestionState(PositionedObjectPropertiesSuggestionState positionedObjectPropertiesSuggestionState) {
    this.positionedObjectPropertiesSuggestionState = positionedObjectPropertiesSuggestionState;
    return this;
  }

  @Override
  public SuggestedPositionedObjectProperties set(String fieldName, Object value) {
    return (SuggestedPositionedObjectProperties) super.set(fieldName, value);
  }

  @Override
  public SuggestedPositionedObjectProperties clone() {
    return (SuggestedPositionedObjectProperties) super.clone();
  }

}
