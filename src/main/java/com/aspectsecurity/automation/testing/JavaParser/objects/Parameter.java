package com.aspectsecurity.automation.testing.JavaParser.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public class Parameter implements io.swagger.models.parameters.Parameter
{
    private String in;
    private String access;
    private String name;
    private String description;
    private boolean required;
    private String pattern;
    private Map<String,Object> vendorExtensions;
    private Boolean readOnly;
    private Boolean allowEmptyValue;

    private String httpParameterName;
    private String codeVariableName;

    private String defaultValue;
    private String type;
    private String annotation;

    public Parameter() { }

    public Parameter(String name, String value) {
        this.setHttpParameterName(name);
        this.setDefaultValue(value);
    }

    @Override
    public String getIn() {
        return in;
    }

    @Override
    public void setIn(String in) {
        this.in = in;
    }

    @Override @JsonIgnore
    public String getAccess() {
        return access;
    }

    @Override @JsonIgnore
    public void setAccess(String access) {
        this.access = access;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getRequired() {
        return required;
    }

    @Override
    public void setRequired(boolean required) {
        this.required = required;
    }

    @Override
    public String getPattern() {
        return pattern;
    }

    @Override
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Map<String, Object> getVendorExtensions() {
        return vendorExtensions;
    }

    public void setVendorExtensions(Map<String, Object> vendorExtensions) {
        this.vendorExtensions = vendorExtensions;
    }

    public Boolean isReadOnly() {
        return readOnly;
    }

    @Override
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public Boolean getAllowEmptyValue() {
        return allowEmptyValue;
    }

    @Override
    public void setAllowEmptyValue(Boolean allowEmptyValue) {
        this.allowEmptyValue = allowEmptyValue;
    }

    public String getHttpParameterName() {
        return httpParameterName;
    }

    public void setHttpParameterName(String httpParameterName) {
        this.httpParameterName = httpParameterName;
    }

    public String getCodeVariableName() {
        return codeVariableName;
    }

    public void setCodeVariableName(String codeVariableName) {
        this.codeVariableName = codeVariableName;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
}
