package com.company;

import java.util.Objects;

public class Tree extends Unit
{
    private boolean dry;

    public Tree()
    {
        this.setType();
    }

    public Tree(Point coordinates, double radius, boolean dry)
    {
        super(coordinates, radius);
        this.dry = dry;
        this.setType();
    }

    public boolean isDry()
    {
        return this.dry;
    }

    public void Pour()
    {
        this.dry = false;
    }

    public void next_week()
    {
        this.dry = true;
    }

    @Override
    public void setType()
    {
        this.type = "Tree";
    }

    @Override
    public String toString()
    {
        return super.toString() + "; Is dry: " + this.dry;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tree tree = (Tree) o;
        return this.dry == tree.dry;
    }


}
