package com.citytechinc.aem.apps.ionic.api.models.application.root;

import com.citytechinc.aem.apps.ionic.api.errors.InvalidApplicationConfigurationException;
import com.citytechinc.aem.apps.ionic.api.models.application.state.ApplicationState;

import java.util.List;
import java.util.Set;

public interface ApplicationRoot {

    String RESOURCE_TYPE = "ionic-aem-apps/components/page/application-root";
    String ANGULAR_REQUIRED_MODULES_KEY = "requiredAngularModules";
    String REQUIRED_CORDOVA_PLUGINS_KEY = "requiredCordovaPlugins";
    String REQUIRED_CLIENT_LIBRARY_CATEGORIES = "requiredClientLibraryCategories";

    String getInitialStateUrl() throws InvalidApplicationConfigurationException;

    String getSanatizedControllerName();

    String getRelativePathToRoot();

    String getRelativePathToState(String absolutePathToState);

    List<ApplicationState> getApplicationStates();

    String getApplicationName();

    Set<String> getRequiredAngularModules();

    Set<String> getRequiredPlugins();

    String getPath();

    String getApplicationDirectory();
}
