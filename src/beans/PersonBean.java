package beans;

public class PersonBean implements java.io.Serializable {

  /**
   * Generated serialVersionUID.
   */
  private static final long serialVersionUID = 1287770691233145611L;

  /**
   * Property <code>name</code> (note capitalization) readable/writable.
   */
  private String name = null;

  private boolean deceased = false;

  /** No-arg constructor (takes no arguments). */
  public PersonBean() {}

  /**
   * Getter for property <code>name</code>
   */
  public String getName() {
    return name;
  }

  /**
   * Setter for property <code>name</code>.
   *
   * @param value
   */
  public void setName(final String value) {
    name = value;
  }

  /**
   * Getter for property "deceased" Different syntax for a boolean field (is vs. get)
   */
  public boolean isDeceased() {
    return deceased;
  }

  /**
   * Setter for property <code>deceased</code>.
   *
   * @param value
   */
  public void setDeceased(final boolean value) {
    deceased = value;
  }
}
