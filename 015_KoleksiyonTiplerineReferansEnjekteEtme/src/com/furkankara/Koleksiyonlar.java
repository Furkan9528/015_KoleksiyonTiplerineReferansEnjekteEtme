package com.furkankara;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Koleksiyonlar {

	List<Object> listeler;
	Set<Object> setler;
	Map<Object, Object> maplar;
	Properties	propertiesler;
	//----------------------------------------------
	public List<Object> getListeler() {
		return listeler;
	}
	public void setListeler(List<Object> listeler) {
		this.listeler = listeler;
	}
	//----------------------------------------------
	public Set<Object> getSetler() {
		return setler;
	}
	public void setSetler(Set<Object> setler) {
		this.setler = setler;
	}
	//----------------------------------------------
	public Map<Object, Object> getMaplar() {
		return maplar;
	}
	public void setMaplar(Map<Object, Object> maplar) {
		this.maplar = maplar;
	}
	//----------------------------------------------
	public Properties getPropertiesler() {
		return propertiesler;
	}
	public void setPropertiesler(Properties propertiesler) {
		this.propertiesler = propertiesler;
	}
	
	
	//----------------------------------------------
	
	@Override
	public String toString() {
		return "Koleksiyonlar [listeler=" + listeler + 
				"\n Set =" + setler + 
				"\n Map=" + maplar + 
				"\n propertiesler="+ propertiesler + "]";
	}
}
