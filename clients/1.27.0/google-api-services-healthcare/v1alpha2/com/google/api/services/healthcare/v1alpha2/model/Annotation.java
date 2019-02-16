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

package com.google.api.services.healthcare.v1alpha2.model;

/**
 * An annotation record.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Annotation extends com.google.api.client.json.GenericJson {

  /**
   * Details of the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AnnotationSource annotationSource;

  /**
   * Annnotations for images, e.g., bounding polygons.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageAnnotation imageAnnotation;

  /**
   * Output only. Resource name of the Annotation, of the form `projects/{project_id}/locations/{loc
   * ation_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_
   * id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Annotations for resource, e.g., classification tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceAnnotation resourceAnnotation;

  /**
   * Annotations for sentitive texts, e.g., range of such texts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SensitiveTextAnnotation textAnnotation;

  /**
   * Details of the source.
   * @return value or {@code null} for none
   */
  public AnnotationSource getAnnotationSource() {
    return annotationSource;
  }

  /**
   * Details of the source.
   * @param annotationSource annotationSource or {@code null} for none
   */
  public Annotation setAnnotationSource(AnnotationSource annotationSource) {
    this.annotationSource = annotationSource;
    return this;
  }

  /**
   * Annnotations for images, e.g., bounding polygons.
   * @return value or {@code null} for none
   */
  public ImageAnnotation getImageAnnotation() {
    return imageAnnotation;
  }

  /**
   * Annnotations for images, e.g., bounding polygons.
   * @param imageAnnotation imageAnnotation or {@code null} for none
   */
  public Annotation setImageAnnotation(ImageAnnotation imageAnnotation) {
    this.imageAnnotation = imageAnnotation;
    return this;
  }

  /**
   * Output only. Resource name of the Annotation, of the form `projects/{project_id}/locations/{loc
   * ation_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_
   * id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the Annotation, of the form `projects/{project_id}/locations/{loc
   * ation_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_
   * id}`.
   * @param name name or {@code null} for none
   */
  public Annotation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Annotations for resource, e.g., classification tags.
   * @return value or {@code null} for none
   */
  public ResourceAnnotation getResourceAnnotation() {
    return resourceAnnotation;
  }

  /**
   * Annotations for resource, e.g., classification tags.
   * @param resourceAnnotation resourceAnnotation or {@code null} for none
   */
  public Annotation setResourceAnnotation(ResourceAnnotation resourceAnnotation) {
    this.resourceAnnotation = resourceAnnotation;
    return this;
  }

  /**
   * Annotations for sentitive texts, e.g., range of such texts.
   * @return value or {@code null} for none
   */
  public SensitiveTextAnnotation getTextAnnotation() {
    return textAnnotation;
  }

  /**
   * Annotations for sentitive texts, e.g., range of such texts.
   * @param textAnnotation textAnnotation or {@code null} for none
   */
  public Annotation setTextAnnotation(SensitiveTextAnnotation textAnnotation) {
    this.textAnnotation = textAnnotation;
    return this;
  }

  @Override
  public Annotation set(String fieldName, Object value) {
    return (Annotation) super.set(fieldName, value);
  }

  @Override
  public Annotation clone() {
    return (Annotation) super.clone();
  }

}
