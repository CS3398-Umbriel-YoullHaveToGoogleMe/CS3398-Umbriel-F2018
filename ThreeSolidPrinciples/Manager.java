/* Manger Seperated from the rest so that it follows Single Responsiblity
pricniple and it can be changed if needed */
import threesolid;

class Manager {
	IWorker worker;

	public void Manager() {

	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}