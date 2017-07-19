
public class Pig extends Animal {

private String skinColor="Pink";
private int nrEyes=2;

public int getNumberOfEyes() {
	return this.nrEyes;
}

public void setNumberOfEyes(int nr) {
	this.nrEyes=nr;
}


public boolean ValidNumberOfEyes() {
	return (this.nrEyes==2);
}

public String getskinColor() {
	return (this.skinColor);
}
}