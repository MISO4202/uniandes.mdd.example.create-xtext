/**
 *
 * $Id$
 */
package petrinet.validation;

import org.eclipse.emf.common.util.EList;

import petrinet.Element;

/**
 * A sample validator interface for {@link petrinet.PetriNet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PetriNetValidator {
	boolean validate();

	boolean validateElements(EList<Element> value);
}
