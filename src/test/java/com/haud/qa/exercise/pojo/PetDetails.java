package com.haud.qa.exercise.pojo;

import java.util.List;

public class PetDetails {
   private String id;
   private String name;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<String> getPhotoUrls() {
      return photoUrls;
   }

   public void setPhotoUrls(List<String> photoUrls) {
      this.photoUrls = photoUrls;
   }

   public List<String> getPhotoURLs() {
      return photoURLs;
   }

   public void setPhotoURLs(List<String> photoURLs) {
      this.photoURLs = photoURLs;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public List<Tag> getTags() {
      return tags;
   }

   public void setTags(List<Tag> tags) {
      this.tags = tags;
   }

   public Category getCategory() {
      return category;
   }

   public void setCategory(Category category) {
      this.category = category;
   }

   private List<String> photoUrls;
   private List<String> photoURLs;
   private String status;
   private List<Tag> tags;
   private Category category;


}
