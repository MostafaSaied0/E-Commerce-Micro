package com.projects.order.kafka;



import com.projects.order.customer.CustomerResponse;
import com.projects.order.order.PaymentMethod;
import com.projects.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
