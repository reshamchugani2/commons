//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.13 at 03:22:53 PM IST 
//

package io.mosip.kernel.biometrics.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Data
@JsonDeserialize(builder = VersionType.VersionTypeBuilder.class)
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionType", propOrder = { "major", "minor" })
public class VersionType implements Serializable {
	@XmlElement(name = "Major")
	@XmlSchemaType(name = "unsignedInt")
	private int major;
	@XmlElement(name = "Minor")
	@XmlSchemaType(name = "unsignedInt")
	private int minor;
	
	public VersionType(VersionTypeBuilder versionTypeBuilder) {
		this.major = versionTypeBuilder.major;
		this.minor = versionTypeBuilder.minor;
	}
	public static class VersionTypeBuilder {
		private int major;
		private int minor;

		public VersionTypeBuilder withMinor(int minor) {
			this.minor = minor;
			return this;
		}

		public VersionTypeBuilder withMajor(int major) {
			this.major = major;
			return this;
		}

		public VersionType build() {
			return new VersionType(this);
		}
	}


}
