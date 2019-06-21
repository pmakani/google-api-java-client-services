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

package com.google.api.services.tagmanager.model;

/**
 * Represents a Google Tag Manager Container, which specifies the platform tags will run on, manages
 * workspaces, and retains container versions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Container extends com.google.api.client.json.GenericJson {

  /**
   * GTM Account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * The Container ID uniquely identifies the GTM Container.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerId;

  /**
   * List of domain names associated with the Container. @mutable
   * tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> domainName;

  /**
   * The fingerprint of the GTM Container as computed at storage time.  This value is recomputed
   * whenever the account is modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * Container display name. @mutable tagmanager.accounts.containers.create @mutable
   * tagmanager.accounts.containers.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Container Notes. @mutable tagmanager.accounts.containers.create @mutable
   * tagmanager.accounts.containers.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notes;

  /**
   * GTM Container's API relative path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Container Public ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publicId;

  /**
   * Auto generated link to the tag manager UI
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagManagerUrl;

  /**
   * List of Usage Contexts for the Container. Valid values include: web, android, or ios. @mutable
   * tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> usageContext;

  /**
   * GTM Account ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * GTM Account ID.
   * @param accountId accountId or {@code null} for none
   */
  public Container setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The Container ID uniquely identifies the GTM Container.
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerId() {
    return containerId;
  }

  /**
   * The Container ID uniquely identifies the GTM Container.
   * @param containerId containerId or {@code null} for none
   */
  public Container setContainerId(java.lang.String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * List of domain names associated with the Container. @mutable
   * tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDomainName() {
    return domainName;
  }

  /**
   * List of domain names associated with the Container. @mutable
   * tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
   * @param domainName domainName or {@code null} for none
   */
  public Container setDomainName(java.util.List<java.lang.String> domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * The fingerprint of the GTM Container as computed at storage time.  This value is recomputed
   * whenever the account is modified.
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * The fingerprint of the GTM Container as computed at storage time.  This value is recomputed
   * whenever the account is modified.
   * @param fingerprint fingerprint or {@code null} for none
   */
  public Container setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Container display name. @mutable tagmanager.accounts.containers.create @mutable
   * tagmanager.accounts.containers.update
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Container display name. @mutable tagmanager.accounts.containers.create @mutable
   * tagmanager.accounts.containers.update
   * @param name name or {@code null} for none
   */
  public Container setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Container Notes. @mutable tagmanager.accounts.containers.create @mutable
   * tagmanager.accounts.containers.update
   * @return value or {@code null} for none
   */
  public java.lang.String getNotes() {
    return notes;
  }

  /**
   * Container Notes. @mutable tagmanager.accounts.containers.create @mutable
   * tagmanager.accounts.containers.update
   * @param notes notes or {@code null} for none
   */
  public Container setNotes(java.lang.String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * GTM Container's API relative path.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * GTM Container's API relative path.
   * @param path path or {@code null} for none
   */
  public Container setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Container Public ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicId() {
    return publicId;
  }

  /**
   * Container Public ID.
   * @param publicId publicId or {@code null} for none
   */
  public Container setPublicId(java.lang.String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * Auto generated link to the tag manager UI
   * @return value or {@code null} for none
   */
  public java.lang.String getTagManagerUrl() {
    return tagManagerUrl;
  }

  /**
   * Auto generated link to the tag manager UI
   * @param tagManagerUrl tagManagerUrl or {@code null} for none
   */
  public Container setTagManagerUrl(java.lang.String tagManagerUrl) {
    this.tagManagerUrl = tagManagerUrl;
    return this;
  }

  /**
   * List of Usage Contexts for the Container. Valid values include: web, android, or ios. @mutable
   * tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUsageContext() {
    return usageContext;
  }

  /**
   * List of Usage Contexts for the Container. Valid values include: web, android, or ios. @mutable
   * tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
   * @param usageContext usageContext or {@code null} for none
   */
  public Container setUsageContext(java.util.List<java.lang.String> usageContext) {
    this.usageContext = usageContext;
    return this;
  }

  @Override
  public Container set(String fieldName, Object value) {
    return (Container) super.set(fieldName, value);
  }

  @Override
  public Container clone() {
    return (Container) super.clone();
  }

}
