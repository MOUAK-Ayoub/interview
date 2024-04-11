select distinct city from customer order by city;
select lastname, firstname
from customer
where
lastname like 'W%'
order by firstname;





select lastname, firstname
from customer
where zipcode in ( '75000','34000')
and birth_date is not null;






select product.name, product_category.name,
from product left join product_category
on product.product_category_id=product_category.product_category_id;







select  distinct c.customer_id

from customer as c

join purchase_order as po
on c.customer_id=po.customer_id

join order_product as op
on po.order_id=op.order_id

join product p
on p.product_id=op.product_id

join product_category pc
pc.product_category_id=p.product_category_id

where pc.name in ( 'Books', 'Garden')

order by c.customer_id;




















