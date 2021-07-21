package service.customer;

import model.Customer;
import model.Province;
import service.IGeneralService;
import model.Customer;
import model.Province;
import service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}