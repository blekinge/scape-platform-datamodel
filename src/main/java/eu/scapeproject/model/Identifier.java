package eu.scapeproject.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="identifier",namespace="http://scapeproject.eu/model")
public class Identifier {
	

	@XmlAttribute(name="type")
    protected final String type;
	@XmlElement(name="value",namespace="http://scapeproject.eu/model")
    protected final String value;

    @SuppressWarnings("unused")
    private Identifier() {
        this.type = null;
        this.value = null;
    }

    public Identifier(String value) {
        super();
        this.type = "String";
        this.value = value;
    }

    public Identifier(String type, String value) {
        super();
        this.type = type;
        this.value = value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Identifier other = (Identifier) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }
    
    @Override
	public String toString() {
		return "Identifier [type=" + type + ", value=" + value + "]";
	}
    
}
