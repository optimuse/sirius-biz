/*
 * Made with all the love in the world
 * by scireum in Remshalden, Germany
 *
 * Copyright by scireum GmbH
 * http://www.scireum.de - info@scireum.de
 */

package sirius.biz.sequences;

import sirius.biz.model.BizEntity;
import sirius.db.mixing.Column;
import sirius.db.mixing.annotations.Length;
import sirius.db.mixing.annotations.Unique;
import sirius.kernel.di.std.Framework;

/**
 * Stores the next counter value for a sequence.
 * <p>
 * This is used by {@link Sequences} to store and generate the next value for a sequence.
 */
@Framework("sequences")
public class SequenceCounter extends BizEntity {

    /**
     * Contains the name of the sequence.
     */
    public static final Column NAME = Column.named("name");
    @Unique
    @Length(100)
    private String name;

    /**
     * Contains the next value which will be generated for this sequence.
     */
    public static final Column NEXT_VALUE = Column.named("nextValue");
    private long nextValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNextValue() {
        return nextValue;
    }

    public void setNextValue(long nextValue) {
        this.nextValue = nextValue;
    }
}
