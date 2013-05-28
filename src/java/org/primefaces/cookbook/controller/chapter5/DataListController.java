package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.converter.CarConverter;
import org.primefaces.cookbook.model.chapter3.Car;
import org.primefaces.cookbook.model.chapter5.CountryList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: mertcaliskan Date: 8/19/12
 */
@ManagedBean
@ViewScoped
public class DataListController implements Serializable {

    public Collection<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }

    public List<String> getCountriesShort() {
        return CountryList.countriesShort;
    }

    public List<String> getCountries() {
        return CountryList.countries;
    }
}