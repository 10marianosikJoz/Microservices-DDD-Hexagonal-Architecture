package com.product.ordering.domain;

import com.product.ordering.domain.entity.Order;
import com.product.ordering.domain.entity.OrderItem;
import com.product.ordering.domain.entity.Product;
import com.product.ordering.domain.valueobject.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class OrderDomainDataProvider {

    public static Order orderWithoutDeliveryMethod() {
        return Order.builder()
                .orderId(new OrderId(OrderConstantDataProvider.ORDER_ID))
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.PENDING)
                .build();
    }

    public static Order orderWithoutPaymentMethod() {
        return Order.builder()
                .orderId(new OrderId(OrderConstantDataProvider.ORDER_ID))
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(Product.builder()
                                        .productId(new ProductId(OrderConstantDataProvider.PRODUCT_ID))
                                        .isAvailable(true)
                                        .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                        .description(new Description(OrderConstantDataProvider.PRODUCT_DESCRIPTION))
                                        .reviews(OrderConstantDataProvider.PRODUCT_REVIEWS)
                                        .build())
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(Product.builder()
                                        .productId(new ProductId(OrderConstantDataProvider.PRODUCT_ID))
                                        .isAvailable(true)
                                        .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                        .description(new Description(OrderConstantDataProvider.PRODUCT_DESCRIPTION))
                                        .reviews(OrderConstantDataProvider.PRODUCT_REVIEWS)
                                        .build())
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.PENDING)
                .build();
    }

    public static Order orderForApproving() {
        return Order.builder()
                .orderId(new OrderId(OrderConstantDataProvider.ORDER_ID))
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.PAID)
                .build();
    }

    public static Order orderForPaying() {
        return Order.builder()
                .orderId(new OrderId(OrderConstantDataProvider.ORDER_ID))
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.PENDING)
                .build();
    }

    public static Order orderWithoutDeliveryAddress() {
        return Order.builder()
                .orderId(new OrderId(OrderConstantDataProvider.ORDER_ID))
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.PENDING)
                .build();
    }

    public static Order orderWithCourierDeliveryMethod() {
        return Order.builder()
                .orderId(new OrderId(OrderConstantDataProvider.ORDER_ID))
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(Product.builder()
                                        .productId(new ProductId(OrderConstantDataProvider.PRODUCT_ID))
                                        .isAvailable(true)
                                        .price(new Money(new BigDecimal("100")))
                                        .description(new Description("Modern product"))
                                        .reviews(List.of(new Review(5, "Great product")))
                                        .build())
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(Product.builder()
                                        .productId(new ProductId(OrderConstantDataProvider.PRODUCT_ID))
                                        .isAvailable(true)
                                        .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                        .description(new Description("Modern product"))
                                        .reviews(List.of(new Review(5, "Great product")))
                                        .build())
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.COURIER_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.PENDING)
                .build();
    }

    public static Order orderWithValidCoupon() {
        return Order.builder()
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.PENDING)
                .build();
    }

    public static Order orderForCancelling() {
        return Order.builder()
                .orderId(new OrderId(OrderConstantDataProvider.ORDER_ID))
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.PENDING)
                .build();
    }

    public static Order orderWithIncorrectPrice() {
        return Order.builder()
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(BigDecimal.ZERO))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .build();
    }

    public static Order orderWithAppropriateState(OrderStatus orderStatus) {
        return Order.builder()
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(orderStatus)
                .build();
    }

    public static Order orderWithCancelledState() {
        return Order.builder()
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.CANCELLED)
                .build();
    }

    public static Order orderWithApprovedState() {
        return Order.builder()
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.APPROVED)
                .build();
    }

    public static Order orderWithPaidState() {
        return Order.builder()
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .orderStatus(OrderStatus.PAID)
                .build();
    }

    public static Order orderToInitialize() {
        return Order.builder()
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .build();
    }

    public static Order orderWithIncorrectTotalPrice() {
        return Order.builder()
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(BigDecimal.valueOf(2000)))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(new Product(new ProductId(OrderConstantDataProvider.PRODUCT_ID)))
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .paymentMethod(OrderConstantDataProvider.PAYMENT_METHOD)
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .build();
    }

    public static Order orderWithoutOrderStatus() {
        return Order.builder()
                .customerId(new CustomerId(OrderConstantDataProvider.CUSTOMER_ID))
                .warehouseId(new WarehouseId(OrderConstantDataProvider.WAREHOUSE_ID))
                .deliveryAddress(DeliveryAddress.builder()
                        .street(OrderConstantDataProvider.STREET)
                        .postalCode(OrderConstantDataProvider.POSTAL_CODE)
                        .city(OrderConstantDataProvider.CITY)
                        .build())
                .price(new Money(OrderConstantDataProvider.ORDER_PRICE))
                .currency(OrderConstantDataProvider.CURRENCY)
                .orderItems(Set.of(OrderItem.builder()
                                .orderItemId(new OrderItemId(OrderConstantDataProvider.ORDER_ID.getLeastSignificantBits()))
                                .product(Product.builder()
                                        .productId(new ProductId(OrderConstantDataProvider.PRODUCT_ID))
                                        .isAvailable(true)
                                        .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                        .description(new Description(OrderConstantDataProvider.PRODUCT_DESCRIPTION))
                                        .reviews(OrderConstantDataProvider.PRODUCT_REVIEWS)
                                        .build())
                                .quantity(new Quantity(1))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCT_SUBTOTAL))
                                .build(),
                        OrderItem.builder()
                                .product(Product.builder()
                                        .productId(new ProductId(OrderConstantDataProvider.PRODUCT_ID))
                                        .isAvailable(true)
                                        .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                        .description(new Description(OrderConstantDataProvider.PRODUCT_DESCRIPTION))
                                        .reviews(OrderConstantDataProvider.PRODUCT_REVIEWS)
                                        .build())
                                .quantity(new Quantity(3))
                                .price(new Money(OrderConstantDataProvider.PRODUCT_PRICE))
                                .subTotal(new Money(OrderConstantDataProvider.PRODUCTS_SUBTOTAL))
                                .build()))
                .deliveryMethod(OrderConstantDataProvider.PACKAGE_BOX_DELIVERY_METHOD)
                .coupon(OrderConstantDataProvider.VALID_COUPON)
                .build();
    }
}