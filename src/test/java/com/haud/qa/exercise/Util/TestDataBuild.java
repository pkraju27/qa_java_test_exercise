package com.haud.qa.exercise.Util;

import com.haud.qa.exercise.pojo.Category;
import com.haud.qa.exercise.pojo.PetDetails;
import com.haud.qa.exercise.pojo.Tag;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestDataBuild {
   public PetDetails createPetPayLoad(String name, String categoryname, String tagname ){
      PetDetails petDetails = new PetDetails();
      petDetails.setName(name);
      petDetails.setStatus("Available");
      Tag tag = new Tag();
      tag.setName(tagname);
      tag.setId("0");
      List<Tag> tags = new ArrayList<>();
      tags.add(tag);
      Category category = new Category();
      category.setName(categoryname);
      category.setId("0");
      petDetails.setCategory(category);
      petDetails.setTags(tags);
      return petDetails;
   }
}
