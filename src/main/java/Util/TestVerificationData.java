package Util;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TestVerificationData {

   static List<String> haudSolutionsDropDownMenuList() {
      List <String> haudSolutionsDropDownMenu = new ArrayList<>();
      haudSolutionsDropDownMenu.add("Smart XChange – A2P Monetisation");
      haudSolutionsDropDownMenu.add("Smart NForce – SS7 Firewall Protection");
      haudSolutionsDropDownMenu.add("Smart Charge");
      haudSolutionsDropDownMenu.add("Smart Enable");
      haudSolutionsDropDownMenu.add("Smart NVision");
      haudSolutionsDropDownMenu.add("Smart Bid");
      return haudSolutionsDropDownMenu;
   }
   static List<String> aboutUsDropDownMenuList() {
      List <String> aboutUsDropDownMenu = new ArrayList<>();
      aboutUsDropDownMenu.add("The Company");
      aboutUsDropDownMenu.add("Meet the team");
      aboutUsDropDownMenu.add("Careers");
      return aboutUsDropDownMenu;
   }

   static Map<String,String> getPageTitleList(){
      Map<String,String> pageTitleList = new HashMap<>();
      pageTitleList.put("logo","A2P SMS Monetisation, SS7 and Diameter Firewall Vendor | HAUD");
      pageTitleList.put("home","A2P SMS Monetisation, SS7 and Diameter Firewall Vendor | HAUD");
      pageTitleList.put("Haud solutions","Security and Monetisation Solutions for MNOs — HAUD");
      pageTitleList.put("Smart Xchange","A2P Monetisation SMS Solution - Improve your A2P Monetization — HAUD");
      pageTitleList.put("Smart NForce","SS7 and Diameter Firewall for Network Security and Protection - SIM Box Fraud Detection - HAUD");
      pageTitleList.put("Smart Charge","Smart Charge — HAUD");
      pageTitleList.put("Smart Enable","Managed services and network monitoring with Smart Enable — HAUD");
      pageTitleList.put("Smart Nvision","Predictive business analytics with Smart NVision — HAUD");
      pageTitleList.put("Smart Bid","Maximise A2P messaging revenue yield with Smart Bid — HAUD");
      pageTitleList.put("Knowledge center","Knowledge Centre — HAUD");
      pageTitleList.put("Trending Topics","Trending topics — HAUD");
      pageTitleList.put("Contact Us","Contact us — HAUD");
      pageTitleList.put("About Haud","About HAUD — A2P monetisation, SS7/Diameter Protection and more...");
      pageTitleList.put("The Company","About HAUD — A2P monetisation, SS7/Diameter Protection and more...");
      pageTitleList.put("Meet the team","Meet the Team — HAUD");
      pageTitleList.put("Careers","Careers — — HAUD");
      return pageTitleList;
   }

   static Map<String,String> getPageURLList(){
      Map<String,String> pageURLList = new HashMap<>();
      pageURLList.put("logo","https://haud.com/");
      pageURLList.put("home","https://haud.com/");
      pageURLList.put("Haud solutions","https://haud.com/products-and-services/");
      pageURLList.put("Smart Xchange","https://haud.com/products-and-services/smart-xchange-a2p-monetisation-solution/");
      pageURLList.put("Smart NForce","https://haud.com/products-and-services/smart-nforce-ss7-and-diameter-protection/");
      pageURLList.put("Smart Charge","https://haud.com/products-and-services/smart-charge-control/");
      pageURLList.put("Smart Enable","https://haud.com/products-and-services/smart-enable/");
      pageURLList.put("Smart Nvision","https://haud.com/products-and-services/smart-nvision/");
      pageURLList.put("Smart Bid","https://haud.com/products-and-services/smart-bid/");
      pageURLList.put("Knowledge center","https://haud.com/knowledge-centre/");
      pageURLList.put("Trending Topics","https://haud.com/blog/");
      pageURLList.put("Contact Us","https://haud.com/contact-us/");
      pageURLList.put("About Haud","https://haud.com/about-haud/");
      pageURLList.put("The Company","https://haud.com/about-haud/");
      pageURLList.put("Meet the team","https://haud.com/about-haud/meet-the-team/");
      pageURLList.put("Careers","https://haud.com/blog/category/careers/");
      return pageURLList;
   }

}
