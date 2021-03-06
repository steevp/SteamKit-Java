package uk.co.thomasc.steamkit.steam3.handlers.steamworkshop.types;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EWorkshopEnumerationType;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the details of an enumeration request for all published files.
 */
public final class EnumerationDetails {
    /**
     * Gets or sets the AppID of the workshop to enumerate.
     */
    public int appID;
    /**
     * Gets or sets the type of the enumeration.
     */
    public EWorkshopEnumerationType type;
    /**
     * Gets or sets the start index.
     */
    public int startIndex;
    /**
     * Gets or sets the days.
     */
    public int days;
    /**
     * Gets or sets the number of results to return.
     */
    public int count;
    /**
     * Gets the list of tags to enumerate.
     */
    private final List<String> tags = new ArrayList<String>();
    /**
     * Gets the list of user tags to enumerate.
     */
    private final List<String> userTags = new ArrayList<String>();

    /**
     * Initializes a new instance of the {@link EnumerationDetails} class.
     */
    public EnumerationDetails() {
    }

    /**
     * Gets the list of tags to enumerate.
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Gets the list of user tags to enumerate.
     */
    public List<String> getUserTags() {
        return this.userTags;
    }
}
