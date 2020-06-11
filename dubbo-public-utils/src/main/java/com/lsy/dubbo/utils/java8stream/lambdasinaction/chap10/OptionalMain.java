//package com.lsy.dubbo.utils.java8stream.lambdasinaction.chap10;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//import java.util.stream.Stream;
//
//import static java.util.stream.Collectors.toSet;
//
//public final class OptionalMain<T> {
//
//    public String getCarInsuranceName(Optional<Person> person) {
//        return person.flatMap(Person::getCar)
//                     .flatMap(Car::getInsurance)
//                     .map(Insurance::getName)
//                     .orElse("Unknown");
//    }
//
//    public Set<String> getCarInsuranceNames(List<Person> persons) {
//        return persons.stream()
//                      .map(Person::getCar)
//                      .map(optCar -> optCar.flatMap(Car::getInsurance))
//                      .map(optInsurance -> optInsurance.map(Insurance::getName))
//                      .flatMap(Optional::stream)
//                      .collect(toSet());
//    }
//}
