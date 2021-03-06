package org.semanticweb.owlapitools.builders;

import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;

/** Builder class for OWLNegativeObjectPropertyAssertionAxiom */
public class BuilderNegativeObjectPropertyAssertion
        extends
        BaseObjectPropertyBuilder<OWLNegativeObjectPropertyAssertionAxiom, BuilderNegativeObjectPropertyAssertion> {
    private OWLIndividual subject = null;
    private OWLIndividual value = null;

    /** builder initialized from an existing object
     * 
     * @param expected
     *            the existing object */
    public BuilderNegativeObjectPropertyAssertion(
            OWLNegativeObjectPropertyAssertionAxiom expected) {
        withSubject(expected.getSubject()).withProperty(expected.getProperty())
                .withValue(expected.getObject())
                .withAnnotations(expected.getAnnotations());
    }

    /** uninitialized builder */
    public BuilderNegativeObjectPropertyAssertion() {}

    /** @param arg
     *            value
     * @return builder */
    public BuilderNegativeObjectPropertyAssertion withValue(OWLIndividual arg) {
        value = arg;
        return this;
    }

    /** @param arg
     *            subject
     * @return builder */
    public BuilderNegativeObjectPropertyAssertion withSubject(OWLIndividual arg) {
        subject = arg;
        return this;
    }

    @Override
    public OWLNegativeObjectPropertyAssertionAxiom buildObject() {
        return df.getOWLNegativeObjectPropertyAssertionAxiom(property, subject, value,
                annotations);
    }
}
