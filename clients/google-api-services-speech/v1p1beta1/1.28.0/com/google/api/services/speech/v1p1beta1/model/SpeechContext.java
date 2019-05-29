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

package com.google.api.services.speech.v1p1beta1.model;

/**
 * Provides "hints" to the speech recognizer to favor specific words and phrases in the results.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech-to-Text API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpeechContext extends com.google.api.client.json.GenericJson {

  /**
   * Hint Boost. Positive value will increase the probability that a specific phrase will be
   * recognized over other similar sounding phrases. The higher the boost, the higher the chance of
   * false positive recognition as well. Negative boost values would correspond to anti-biasing.
   * Anti-biasing is not enabled, so negative boost will simply be ignored. Though `boost` can
   * accept a wide range of positive values, most use cases are best served with values between 0
   * and 20. We recommend using a binary search approach to finding the optimal value for your use
   * case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float boost;

  /**
   * *Optional* A list of strings containing words and phrases "hints" so that the speech
   * recognition is more likely to recognize them. This can be used to improve the accuracy for
   * specific words and phrases, for example, if specific commands are typically spoken by the user.
   * This can also be used to add additional words to the vocabulary of the recognizer. See [usage
   * limits](/speech-to-text/quotas#content).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> phrases;

  /**
   * Hint Boost. Positive value will increase the probability that a specific phrase will be
   * recognized over other similar sounding phrases. The higher the boost, the higher the chance of
   * false positive recognition as well. Negative boost values would correspond to anti-biasing.
   * Anti-biasing is not enabled, so negative boost will simply be ignored. Though `boost` can
   * accept a wide range of positive values, most use cases are best served with values between 0
   * and 20. We recommend using a binary search approach to finding the optimal value for your use
   * case.
   * @return value or {@code null} for none
   */
  public java.lang.Float getBoost() {
    return boost;
  }

  /**
   * Hint Boost. Positive value will increase the probability that a specific phrase will be
   * recognized over other similar sounding phrases. The higher the boost, the higher the chance of
   * false positive recognition as well. Negative boost values would correspond to anti-biasing.
   * Anti-biasing is not enabled, so negative boost will simply be ignored. Though `boost` can
   * accept a wide range of positive values, most use cases are best served with values between 0
   * and 20. We recommend using a binary search approach to finding the optimal value for your use
   * case.
   * @param boost boost or {@code null} for none
   */
  public SpeechContext setBoost(java.lang.Float boost) {
    this.boost = boost;
    return this;
  }

  /**
   * *Optional* A list of strings containing words and phrases "hints" so that the speech
   * recognition is more likely to recognize them. This can be used to improve the accuracy for
   * specific words and phrases, for example, if specific commands are typically spoken by the user.
   * This can also be used to add additional words to the vocabulary of the recognizer. See [usage
   * limits](/speech-to-text/quotas#content).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPhrases() {
    return phrases;
  }

  /**
   * *Optional* A list of strings containing words and phrases "hints" so that the speech
   * recognition is more likely to recognize them. This can be used to improve the accuracy for
   * specific words and phrases, for example, if specific commands are typically spoken by the user.
   * This can also be used to add additional words to the vocabulary of the recognizer. See [usage
   * limits](/speech-to-text/quotas#content).
   * @param phrases phrases or {@code null} for none
   */
  public SpeechContext setPhrases(java.util.List<java.lang.String> phrases) {
    this.phrases = phrases;
    return this;
  }

  @Override
  public SpeechContext set(String fieldName, Object value) {
    return (SpeechContext) super.set(fieldName, value);
  }

  @Override
  public SpeechContext clone() {
    return (SpeechContext) super.clone();
  }

}
