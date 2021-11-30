SELECT *

FROM item 
JOIN corder
	ON item.item_id=corder.item_id

JOIN manager
	ON 