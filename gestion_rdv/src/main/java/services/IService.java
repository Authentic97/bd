package services;

import java.util.ArrayList;

public interface IService<franck> {
    int add(franck data);
    ArrayList<franck> getAll();
    franck show(int id);
    franck get(int id);
}
