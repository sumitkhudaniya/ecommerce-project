import { Address } from "./address";
import { Customer } from "./customer";
import { Order } from "./order";
import { OrderItem } from "./order-item";

export class Purchase {
    customer: Customer | undefined;
    shippingAddress!: Address;
    billingAddress!: Address;
    order: Order | undefined;
    orderItems: OrderItem[] | undefined;
}
