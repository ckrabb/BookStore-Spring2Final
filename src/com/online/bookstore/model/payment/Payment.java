package com.online.bookstore.model.payment;
import java.util.List;

import com.online.bookstore.model.customer.Customer;
import com.online.bookstore.model.order.Order;
public interface Payment  {

    public int getPaymentID();
    public void setPaymentID(int paymentID);

    public String getPaymentMethod();
    public void setPaymentMethod(String paymentMethod);

    public String getPaymentDate();
    public void setPaymentDate(String paymentDate);
}