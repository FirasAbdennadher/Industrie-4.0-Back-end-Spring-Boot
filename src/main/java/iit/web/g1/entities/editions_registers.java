package iit.web.g1.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//@JsonSerialize
//@JsonFormat(with = Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)

public class editions_registers implements Serializable{
	
private registers registers ;
private editions editions;
public editions_registers(iit.web.g1.entities.registers registers, iit.web.g1.entities.editions editions) {
	super();
	this.registers = registers;
	this.editions = editions;
}
public editions_registers() {
	super();
}
public registers getRegisters() {
	return registers;
}
public void setRegisters(registers registers) {
	this.registers = registers;
}
public editions getEditions() {
	return editions;
}
public void setEditions(editions editions) {
	this.editions = editions;
}
@Override
public String toString() {
	return "editions_registers [registers=" + registers + ", editions=" + editions + "]";
}


	
}