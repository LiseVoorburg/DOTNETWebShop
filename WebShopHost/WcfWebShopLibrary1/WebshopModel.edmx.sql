
-- --------------------------------------------------
-- Entity Designer DDL Script for SQL Server 2005, 2008, 2012 and Azure
-- --------------------------------------------------
-- Date Created: 06/08/2018 10:41:45
-- Generated from EDMX file: C:\Users\koenfischer\Source\Repos\DOTNETWebShop\WcfWebShopLibrary1\WebshopModel.edmx
-- --------------------------------------------------

SET QUOTED_IDENTIFIER OFF;
GO
USE [webshopDB];
GO
IF SCHEMA_ID(N'dbo') IS NULL EXECUTE(N'CREATE SCHEMA [dbo]');
GO

-- --------------------------------------------------
-- Dropping existing FOREIGN KEY constraints
-- --------------------------------------------------


-- --------------------------------------------------
-- Dropping existing tables
-- --------------------------------------------------


-- --------------------------------------------------
-- Creating all tables
-- --------------------------------------------------

-- Creating table 'Gebruikers'
CREATE TABLE [dbo].[Gebruikers] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [Wachtwoord] nvarchar(max)  NOT NULL,
    [Saldo] float  NOT NULL,
    [Naam] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Orders'
CREATE TABLE [dbo].[Orders] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [Datum] int  NOT NULL,
    [GebruikerId] nvarchar(max)  NOT NULL,
    [Gebruiker_Id] int  NOT NULL
);
GO

-- Creating table 'Products'
CREATE TABLE [dbo].[Products] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [Prijs] float  NOT NULL,
    [Naam] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'OrderRegels'
CREATE TABLE [dbo].[OrderRegels] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [Aantal] int  NOT NULL,
    [OrderId] int  NOT NULL,
    [Order_Id] int  NOT NULL,
    [Product_Id] int  NOT NULL
);
GO

-- --------------------------------------------------
-- Creating all PRIMARY KEY constraints
-- --------------------------------------------------

-- Creating primary key on [Id] in table 'Gebruikers'
ALTER TABLE [dbo].[Gebruikers]
ADD CONSTRAINT [PK_Gebruikers]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [Id] in table 'Orders'
ALTER TABLE [dbo].[Orders]
ADD CONSTRAINT [PK_Orders]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [Id] in table 'Products'
ALTER TABLE [dbo].[Products]
ADD CONSTRAINT [PK_Products]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [Id] in table 'OrderRegels'
ALTER TABLE [dbo].[OrderRegels]
ADD CONSTRAINT [PK_OrderRegels]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- --------------------------------------------------
-- Creating all FOREIGN KEY constraints
-- --------------------------------------------------

-- Creating foreign key on [Gebruiker_Id] in table 'Orders'
ALTER TABLE [dbo].[Orders]
ADD CONSTRAINT [FK_GebruikerOrder]
    FOREIGN KEY ([Gebruiker_Id])
    REFERENCES [dbo].[Gebruikers]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_GebruikerOrder'
CREATE INDEX [IX_FK_GebruikerOrder]
ON [dbo].[Orders]
    ([Gebruiker_Id]);
GO

-- Creating foreign key on [Order_Id] in table 'OrderRegels'
ALTER TABLE [dbo].[OrderRegels]
ADD CONSTRAINT [FK_OrderOrderRegel]
    FOREIGN KEY ([Order_Id])
    REFERENCES [dbo].[Orders]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_OrderOrderRegel'
CREATE INDEX [IX_FK_OrderOrderRegel]
ON [dbo].[OrderRegels]
    ([Order_Id]);
GO

-- Creating foreign key on [Product_Id] in table 'OrderRegels'
ALTER TABLE [dbo].[OrderRegels]
ADD CONSTRAINT [FK_OrderRegelProduct]
    FOREIGN KEY ([Product_Id])
    REFERENCES [dbo].[Products]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_OrderRegelProduct'
CREATE INDEX [IX_FK_OrderRegelProduct]
ON [dbo].[OrderRegels]
    ([Product_Id]);
GO

-- --------------------------------------------------
-- Script has ended
-- --------------------------------------------------