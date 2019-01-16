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

package com.google.api.services.androiddeviceprovisioning.v1.model;

/**
 * Identifies one unclaim request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartnerUnclaim extends com.google.api.client.json.GenericJson {

  /**
   * Device ID of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long deviceId;

  /**
   * Device identifier of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceIdentifier deviceIdentifier;

  /**
   * Required. The section type of the device's provisioning record.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sectionType;

  /**
   * Device ID of the device.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDeviceId() {
    return deviceId;
  }

  /**
   * Device ID of the device.
   * @param deviceId deviceId or {@code null} for none
   */
  public PartnerUnclaim setDeviceId(java.lang.Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Device identifier of the device.
   * @return value or {@code null} for none
   */
  public DeviceIdentifier getDeviceIdentifier() {
    return deviceIdentifier;
  }

  /**
   * Device identifier of the device.
   * @param deviceIdentifier deviceIdentifier or {@code null} for none
   */
  public PartnerUnclaim setDeviceIdentifier(DeviceIdentifier deviceIdentifier) {
    this.deviceIdentifier = deviceIdentifier;
    return this;
  }

  /**
   * Required. The section type of the device's provisioning record.
   * @return value or {@code null} for none
   */
  public java.lang.String getSectionType() {
    return sectionType;
  }

  /**
   * Required. The section type of the device's provisioning record.
   * @param sectionType sectionType or {@code null} for none
   */
  public PartnerUnclaim setSectionType(java.lang.String sectionType) {
    this.sectionType = sectionType;
    return this;
  }

  @Override
  public PartnerUnclaim set(String fieldName, Object value) {
    return (PartnerUnclaim) super.set(fieldName, value);
  }

  @Override
  public PartnerUnclaim clone() {
    return (PartnerUnclaim) super.clone();
  }

}
