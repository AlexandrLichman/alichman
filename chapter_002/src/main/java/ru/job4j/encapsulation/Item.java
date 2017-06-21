package ru.job4j.encapsulation;

/**
 * Item.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 16.06.2017
 */
public class Item {

    /**
     * Private field id type String.
     */
    private String id;

    /**
     * Private field name type String.
     */
    private String name;

    /**
     * Private field desc type String.
     */
    private String desc;

    /**
     * Private field created type long.
     */
    private long created;

    /**
     * Class constructor.
     */
    public Item() {
        this.id = "not id";
        this.name = "not name";
        this.desc = "no description";
        this.created = System.currentTimeMillis();
    }

    /**
     * Class constructor.
     *
     * @param name initializes field name String
     * @param desc initializes field desc String
     */
    public Item(String name, String desc) {
        this.id = "add ID";
        this.name = name;
        this.desc = desc;
        this.created = System.currentTimeMillis();
    }

    /**
     * method returns id.
     *
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * method initializes id.
     *
     * @param id initializes field id String
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * method returns name.
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * method initializes name.
     *
     * @param name initializes field name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method returns description.
     *
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * method initializes desc.
     *
     * @param desc initializes field desc String
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * method returns created.
     *
     * @return created
     */
    public long getCreated() {
        return created;
    }

    /**
     * method initializes created.
     *
     * @param created initializes field created long
     */
    public void setCreated(long created) {
        this.created = created;
    }
}