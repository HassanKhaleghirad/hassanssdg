package service;

import Model.message.ConfigMessage;

public interface ConfigurationService {
    String get(String paramString1, String paramString2);

    void set(String paramString1, String paramString2);

    void addConfigChangeListener(String paramString, ConfigChangeListener paramConfigListener);

    void removeConfigChangeListener(String paramString, ConfigChangeListener paramConfigListener);

    public static interface ConfigChangeListener{
        void  onConfigChange (ConfigMessage param1ConfigMessage);
    }

}
