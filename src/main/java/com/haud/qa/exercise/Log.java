package com.haud.qa.exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

   private static final Logger LOGGER = LogManager.getLogger(Log.class);

   public static void debug(final String logMessage) {
      LOGGER.debug(logMessage);
   }

   public static void info(final String logMessage) {
      LOGGER.info(logMessage);
   }

   public static void warn(final String logMessage) {
      LOGGER.warn(logMessage);
   }

   public static void error(final Exception e) {
      LOGGER.error(e.getMessage(), e);
   }

   public static void fatal(final Exception e) {
      LOGGER.fatal(e.getMessage(), e);
   }
}
