package com.example.xydzjnq.aidl;

public interface IOnNewBookArrivedListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements IOnNewBookArrivedListener {
        private static final java.lang.String DESCRIPTOR = "com.example.xydzjnq.aidl.IOnNewBookArrivedListener";

        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        public static IOnNewBookArrivedListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof IOnNewBookArrivedListener))) {
                return ((IOnNewBookArrivedListener) iin);
            }
//            return new IOnNewBookArrivedListener.Stub.Proxy(obj);
            return null;
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            java.lang.String descriptor = DESCRIPTOR;
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(descriptor);
                    return true;
                }
                case TRANSACTION_onNewBookArrived: {
                    data.enforceInterface(descriptor);
                    Book _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = Book.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    this.onNewBookArrived(_arg0);
                    reply.writeNoException();
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

//        private static class Proxy implements IOnNewBookArrivedListener {
//            private android.os.IBinder mRemote;
//
//            Proxy(android.os.IBinder remote) {
//                mRemote = remote;
//            }
//
//            @Override
//            public android.os.IBinder asBinder() {
//                return mRemote;
//            }
//
//            public java.lang.String getInterfaceDescriptor() {
//                return DESCRIPTOR;
//            }
//
//            @Override
//            public void onNewBookArrived(Book newBook) throws android.os.RemoteException {
//                android.os.Parcel _data = android.os.Parcel.obtain();
//                android.os.Parcel _reply = android.os.Parcel.obtain();
//                try {
//                    _data.writeInterfaceToken(DESCRIPTOR);
//                    if ((newBook != null)) {
//                        _data.writeInt(1);
//                        newBook.writeToParcel(_data, 0);
//                    } else {
//                        _data.writeInt(0);
//                    }
//                    mRemote.transact(Stub.TRANSACTION_onNewBookArrived, _data, _reply, 0);
//                    _reply.readException();
//                } finally {
//                    _reply.recycle();
//                    _data.recycle();
//                }
//            }
//        }

        static final int TRANSACTION_onNewBookArrived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    }

    public void onNewBookArrived(Book newBook) throws android.os.RemoteException;
}
