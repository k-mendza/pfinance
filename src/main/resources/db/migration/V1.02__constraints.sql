ALTER TABLE public.transaction
    ADD CONSTRAINT fk_transaction_category FOREIGN KEY (category_id)
        REFERENCES public.transaction_category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_transaction_transaction_category
    ON public.transaction(category_id);

ALTER TABLE public.transaction
    ADD CONSTRAINT fk_app_user FOREIGN KEY (app_user_id)
        REFERENCES public.app_user (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_transaction_app_user
    ON public.transaction(app_user_id);

ALTER TABLE public.transaction_subcategory
    ADD CONSTRAINT fk_transaction_category FOREIGN KEY (category_id)
        REFERENCES public.transaction_category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_transaction_subcategory_transaction_category
    ON public.transaction_subcategory(category_id);

ALTER TABLE public.transaction
    ADD CONSTRAINT fk_transaction_payee FOREIGN KEY (payee_id)
        REFERENCES public.payee (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_transaction_payee
    ON public.transaction(payee_id);

ALTER TABLE public.transaction
    ADD CONSTRAINT fk_transaction_currency FOREIGN KEY (currency_id)
        REFERENCES public.currency (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_transaction_currency
    ON public.transaction(currency_id);

ALTER TABLE public.transaction
    ADD CONSTRAINT fk_transaction_pay_source FOREIGN KEY (pay_source_id)
        REFERENCES public.pay_source (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_transaction_pay_source
    ON public.transaction(pay_source_id);
