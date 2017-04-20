
package io.objectbox.test.proguard;

import io.objectbox.Properties;
import io.objectbox.Property;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.IdGetter;


// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * Properties for entity "ObfuscatedEntity". Can be used for QueryBuilder and for referencing DB names.
 */
public class ObfuscatedEntity_ implements Properties {

    // Leading underscores for static constants to avoid naming conflicts with property names

    public static final String __DB_NAME = "ObfuscatedEntity";

    @Internal
    static final IdGetter<ObfuscatedEntity> __ID_GETTER = new ObfuscatedEntityIdGetter();

    public final static Property id = new Property(0, 1, long.class, "id", true, "id");
    public final static Property myInt = new Property(1, 2, int.class, "myInt");
    public final static Property myString = new Property(2, 3, String.class, "myString");

    public final static Property[] __ALL_PROPERTIES = {
        id,
        myInt,
        myString
    };

    public final static Property __ID_PROPERTY = id;

    @Override
    public Property[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public Property getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public String getDbName() {
        return __DB_NAME;
    }

    @Override
    public IdGetter<ObfuscatedEntity> getIdGetter() {
        return __ID_GETTER;
    }

    @Internal
    static class ObfuscatedEntityIdGetter implements IdGetter<ObfuscatedEntity> {
        public long getId(ObfuscatedEntity object) {
            return object.getId();
        }
    }
}
