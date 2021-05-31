package Util;

public interface GetProperty {
   AppProperties properties = new AppProperties();
   String BROWSER_NAME = properties.getBrowser_name();
   String BROWSER_VERSION = properties.getBrowser_version();
   String PLATFORM = properties.getPlatform_type();
}
