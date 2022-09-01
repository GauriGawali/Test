package inheritanceWithGetterSetter;

public class Swift extends Maruti {
String engine,modelNo,groundClear;

public void setEngine(String engine)
{
	this.engine=engine;
	}

public String getEngine() {
	return engine;
}

public String getModelNo() {
	return modelNo;
}

public void setModelNo(String modelNo) {
	this.modelNo = modelNo;
}

public String getGroundClear() {
	return groundClear;
}

public void setGroundClear(String groundClear) {
	this.groundClear = groundClear;
}

}
