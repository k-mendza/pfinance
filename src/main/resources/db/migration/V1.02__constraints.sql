ALTER TABLE public.expense
    ADD CONSTRAINT fk_expense_category FOREIGN KEY (category_id)
        REFERENCES public.expense_category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_expense_expense_category
    ON public.expense(category_id);

ALTER TABLE public.expense
    ADD CONSTRAINT fk_app_user FOREIGN KEY (app_user_id)
        REFERENCES public.app_user (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_expense_app_user
    ON public.expense(app_user_id);

ALTER TABLE public.income
    ADD CONSTRAINT fk_income_category FOREIGN KEY (category_id)
        REFERENCES public.income_category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_income_income_category
    ON public.income(category_id);

ALTER TABLE public.income
    ADD CONSTRAINT fk_app_user FOREIGN KEY (app_user_id)
        REFERENCES public.app_user (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_income_app_user
    ON public.income(app_user_id);

ALTER TABLE public.income_subcategory
    ADD CONSTRAINT fk_income_category FOREIGN KEY (category_id)
        REFERENCES public.income_category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_income_subcategory_income_category
    ON public.income_subcategory(category_id);

ALTER TABLE public.expense_subcategory
    ADD CONSTRAINT fk_expense_category FOREIGN KEY (category_id)
        REFERENCES public.expense_category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION;
CREATE INDEX fki_expense_subcategory_expense_category
    ON public.expense_subcategory(category_id);
