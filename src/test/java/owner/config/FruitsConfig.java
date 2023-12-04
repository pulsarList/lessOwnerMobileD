package owner.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Key("array")
    String[] getFruitsArray();

    @Key("array_default")
    @DefaultValue("orange, apple")
    String[] getFruitsArrayDefault();

    @Key("list")
    @DefaultValue("banana, orange")
    List<String> getFruitsArrayList();

    @Key("list-separator")
    @Separator(";")
    @DefaultValue("orange; banana")
    List<String> getFruitsArrayListSeparator();
}
