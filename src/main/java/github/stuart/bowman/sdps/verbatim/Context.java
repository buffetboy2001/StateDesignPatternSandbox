/**
 * 
 */
package github.stuart.bowman.sdps.verbatim;

/**
 * @author Stuart
 *
 */
public class Context {

	public final static State defaultState = new StateA();
	private State currentState = defaultState;
	
	public Context() {
		// TODO complete me
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
}
